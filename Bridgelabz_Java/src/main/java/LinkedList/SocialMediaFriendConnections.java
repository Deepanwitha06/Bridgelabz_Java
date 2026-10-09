package LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

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
    private User findUserById(int userId) {
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
                System.out.println(
                        "ID: "+friend.userId+
                                ", Name: "+friend.name+
                                ", Age: "+friend.age
                );
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

        System.out.println(
                "\nMutual friends of "+user1.name+
                        " and "+user2.name+":"
        );

        for(int friendId:user1.friendIds) {
            if(user2.friendIds.contains(friendId)) {
                User friend=findUserById(friendId);

                if(friend!=null) {
                    System.out.println(
                            "ID: "+friend.userId+
                                    ", Name: "+friend.name
                    );
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
        System.out.println("\nUser Details:");
        System.out.println("User ID: "+user.userId);
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
            System.out.println(
                    "User: "+current.name+
                            " (ID: "+current.userId+")"+
                            " - Friends: "+current.friendIds.size()
            );

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
            System.out.println(
                    "ID: "+current.userId+
                            ", Name: "+current.name+
                            ", Age: "+current.age+
                            ", Friends: "+current.friendIds.size()
            );

            current=current.next;
        }
    }
}

public class SocialMediaFriendConnections {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        SocialMediaLinkedList socialMedia=new SocialMediaLinkedList();

        int choice;

        do {
            System.out.println("\n===== Social Media Friend Connections =====");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Find Mutual Friends");
            System.out.println("5. Display Friends of a User");
            System.out.println("6. Search User by ID");
            System.out.println("7. Search User by Name");
            System.out.println("8. Count Friends for Each User");
            System.out.println("9. Display All Users");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            choice=input.nextInt();
            input.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int userId=input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Name: ");
                    String name=input.nextLine();

                    System.out.print("Enter Age: ");
                    int age=input.nextInt();

                    if(age<=0) {
                        System.out.println("Age must be positive.");
                    } else {
                        socialMedia.addUser(userId,name,age);
                    }
                    break;

                case 2:
                    System.out.print("Enter first User ID: ");
                    int firstUserId=input.nextInt();

                    System.out.print("Enter second User ID: ");
                    int secondUserId=input.nextInt();

                    socialMedia.addFriendConnection(
                            firstUserId,secondUserId
                    );
                    break;

                case 3:
                    System.out.print("Enter first User ID: ");
                    int removeUserId1=input.nextInt();

                    System.out.print("Enter second User ID: ");
                    int removeUserId2=input.nextInt();

                    socialMedia.removeFriendConnection(
                            removeUserId1,removeUserId2
                    );
                    break;

                case 4:
                    System.out.print("Enter first User ID: ");
                    int mutualUserId1=input.nextInt();

                    System.out.print("Enter second User ID: ");
                    int mutualUserId2=input.nextInt();

                    socialMedia.findMutualFriends(
                            mutualUserId1,mutualUserId2
                    );
                    break;

                case 5:
                    System.out.print("Enter User ID: ");
                    int displayUserId=input.nextInt();

                    socialMedia.displayFriends(displayUserId);
                    break;

                case 6:
                    System.out.print("Enter User ID: ");
                    int searchId=input.nextInt();

                    socialMedia.searchUserById(searchId);
                    break;

                case 7:
                    System.out.print("Enter Name: ");
                    String searchName=input.nextLine();

                    socialMedia.searchUserByName(searchName);
                    break;

                case 8:
                    socialMedia.countFriendsForEachUser();
                    break;

                case 9:
                    socialMedia.displayAllUsers();
                    break;

                case 10:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while(choice!=10);

        input.close();
    }
}