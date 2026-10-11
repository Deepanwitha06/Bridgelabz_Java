package LinkedList;
import java.util.ArrayList;
import java.util.Scanner;
/*
       using singly linked list
       Social Media Friend Connections

 */
class User {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds;
    User next;

    User(int userId,String name,int age) {
        this.userId=userId;
        this.name=name;
        this.age=age;
        this.friendIds=new ArrayList<>();
        this.next=null;
    }
}

class SocialMediaLinkedList {
    private User head;

    // Find a user by ID
    public User findUserById(int userId) {
        User current=head;
        while(current!=null) {
            if(current.userId==userId) {
                return current;
            }
            current=current.next;
        }
        return null;
    }

    // Add a new user at the end of the list
    public void addUser(int userId,String name,int age) {
        if(findUserById(userId)!=null) {
            System.out.println("User ID already exists.");
            return;
        }
        User newUser=new User(userId,name,age);
        if(head==null) {
            head=newUser;
        } else {
            User current=head;
            while(current.next!=null) {
                current=current.next;
            }
            current.next=newUser;
        }
        System.out.println("User added successfully.");
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1,int userId2) {
        if(userId1==userId2) {
            System.out.println("A user cannot be their own friend.");
            return;
        }
        User user1=findUserById(userId1);
        User user2=findUserById(userId2);
        if(user1==null || user2==null) {
            System.out.println("One or both users were not found.");
            return;
        }
        if(user1.friendIds.contains(userId2)) {
            System.out.println("Friend connection already exists.");
            return;
        }
        // Create a mutual friendship
        user1.friendIds.add(userId2);
        user2.friendIds.add(userId1);
        System.out.println("Friend connection added successfully.");
    }

    // Remove a friend connection
    public void removeFriendConnection(int userId1,int userId2) {
        User user1=findUserById(userId1);
        User user2=findUserById(userId2);
        if(user1==null || user2==null) {
            System.out.println("One or both users were not found.");
            return;
        }
        if(!user1.friendIds.contains(userId2)) {
            System.out.println("Friend connection does not exist.");
            return;
        }
        user1.friendIds.remove(Integer.valueOf(userId2));
        user2.friendIds.remove(Integer.valueOf(userId1));
        System.out.println("Friend connection removed successfully.");
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        User user=findUserById(userId);
        if(user==null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("\nFriends of "+user.name+":");
        if(user.friendIds.isEmpty()) {
            System.out.println("This user has no friends.");
            return;
        }

        for(int friendId:user.friendIds) {
            User friend=findUserById(friendId);
            if(friend!=null) {
                System.out.println("ID: "+friend.userId+ ", Name: "+friend.name+ ", Age: "+friend.age);
            }
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1,int userId2) {
        User user1=findUserById(userId1);
        User user2=findUserById(userId2);

        if(user1==null || user2==null) {
            System.out.println("One or both users were not found.");
            return;
        }

        boolean found=false;
        System.out.println("\nMutual friends of "+user1.name+ " and "+user2.name+":");
        for(int friendId:user1.friendIds) {
            if(user2.friendIds.contains(friendId)) {
                User friend=findUserById(friendId);
                if(friend!=null) {
                    System.out.println("ID: "+friend.userId+ ", Name: "+friend.name);
                    found=true;
                }
            }
        }

        if(!found) {
            System.out.println("No mutual friends found.");
        }
    }

    // Search for a user by ID
    public void searchUserById(int userId) {
        User user=findUserById(userId);
        if(user==null) {
            System.out.println("User not found.");
            return;
        }
        displayUserDetails(user);
    }

    // Search for users by name
    public void searchUserByName(String name) {
        User current=head;
        boolean found=false;
        while(current!=null) {
            if(current.name.equalsIgnoreCase(name)) {
                displayUserDetails(current);
                found=true;
            }
            current=current.next;
        }
        if(!found) {
            System.out.println("No user found with that name.");
        }
    }

    // Display user details
    private void displayUserDetails(User user) {
        System.out.println("\nUser Details:\nUser ID: "+user.userId);
        System.out.println("Name: "+user.name);
        System.out.println("Age: "+user.age);
        System.out.println("Number of Friends: "+user.friendIds.size());
    }

    // Count friends for every user
    public void countFriendsForEachUser() {
        if(head==null) {
            System.out.println("No users available.");
            return;
        }

        User current=head;
        System.out.println("\nFriend Count for Each User:");
        while(current!=null) {
            System.out.println("User: "+current.name+ " (ID: "+current.userId+")"+ " - Friends: "+current.friendIds.size());
            current=current.next;
        }
    }

    // Display all users
    public void displayAllUsers() {
        if(head==null) {
            System.out.println("No users available.");
            return;
        }
        User current=head;
        System.out.println("\nAll Users:");
        while(current!=null) {
            System.out.println("ID: "+current.userId+ ", Name: "+current.name+ ", Age: "+current.age+ ", Friends: "+current.friendIds.size());
            current=current.next;
        }
    }
}


public class SocialMediaFriendConnections {
    public static void main(String[] args){
        SocialMediaLinkedList socialMedia=new SocialMediaLinkedList();
        socialMedia.addUser(1,"Arun",21);
        socialMedia.addUser(2,"Priya",22);
        socialMedia.addUser(3,"Kavin",20);
        socialMedia.addUser(4,"Divya",21);

        socialMedia.addFriendConnection(1,2);
        socialMedia.addFriendConnection(1,3);
        socialMedia.addFriendConnection(2,3);
        socialMedia.addFriendConnection(3,4);

        socialMedia.displayAllUsers();

        socialMedia.displayFriends(1);

        socialMedia.findMutualFriends(1,2);

        socialMedia.searchUserById(3);

        socialMedia.searchUserByName("Priya");

        socialMedia.countFriendsForEachUser();

        socialMedia.removeFriendConnection(1,2);

        socialMedia.displayFriends(1);
    }
}
