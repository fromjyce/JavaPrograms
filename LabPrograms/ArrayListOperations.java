/*Write a program to perform string operations using ArrayList. Write functions for the following 
a. Append - add at end 
b. Insert - add at particular index 
c. Search 
d. List all string starts with given letter
 */

import java.util.*;


public class ArrayListOperations {

    ArrayList<String> Elements = new ArrayList<String>();
    Scanner scan = new Scanner (System.in);

    void addingelements() {
        int choice = 0;
        while (choice != 4) {
            System.out.print("1. Insert At Beginning \n2. Insert At A Position \n3. Insert at End \nEnter Your Choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            if (choice==1) {
                System.out.print("Enter the Element: ");
                String elem = scan.nextLine();
                Elements.add(0, elem);
                break;
            } else if (choice==2) {
                System.out.print("Enter the Position" );
                int pos = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter the Element: ");
                String elem = scan.nextLine();
                Elements.add(pos-1, elem);
                break;
            } else if (choice==3) {
                System.out.print("Enter the Element: ");
                String elem = scan.nextLine();
                Elements.add((Elements.size()-1), elem);
                break;
            }
        }
        
    }

    void deletingelements() {
        System.out.print("Enter Position: ");
        int pos = scan.nextInt();
        scan.nextLine();
        Elements.remove(pos);
    }

    void searchingelements() {
        System.out.print("Enter the Element that you want to search: ");
        String elem = scan.nextLine();
        if (Elements.contains(elem) == true) {
            System.out.print("Element found at" + (Elements.indexOf(elem)+1));
        }
        else {
            System.out.print("Element not found");
        }
    }

    void listingelements() {
        System.out.print("Enter the Character: ");
        char eleml = scan.next().charAt(0);
        for (int i = 0; i<Elements.size(); i++) {
            if (Elements.get(i).charAt(0) == eleml) {
                System.out.print("Element found - " + Elements.get(i));
            } else {
                System.out.print("Element not found");
            }
        }
    }
    public static void main(String[] args) {
        ArrayListOperations arrlist = new ArrayListOperations();
        try {
            int mainchoice = 0;
            while (mainchoice!=5) {
                System.out.print("Do you want to \n1. Add Element \n2. Delete Element \n3. Search Element \n4. List All Elements \n5. Exit \nEnter Your Choice: ");
                mainchoice = arrlist.scan.nextInt();
                arrlist.scan.nextLine();
                if (mainchoice==1) {
                    arrlist.addingelements();
                    
                }

                else if (mainchoice==2) {
                    arrlist.deletingelements();
                }

                else if (mainchoice==3) {
                    arrlist.searchingelements();
                }

                else if (mainchoice==4) {
                    arrlist.listingelements();
                }

                else if (mainchoice==5) {
                    break;
                }
            }


        } catch (InputMismatchException e){
            System.out.println("Input error: Please enter a valid integer.");
        } finally {
            arrlist.scan.close();
        }
    }
    
}
