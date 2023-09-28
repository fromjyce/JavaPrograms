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

    }

    void deletingelements() {

    }

    void searchingelements() {

    }

    void listingelements() {

    }
    public static void main(String[] args) {
        ArrayListOperations arrlist = new ArrayListOperations();
        try {
            int mainchoice = 0;
            while (mainchoice!=5) {
                System.out.print("Do you want to \n1. Add Element \n2. Delete Element \n3. Search Element \n4. List All Elements \n5. Exit \nEnter Your Choice: ");
                mainchoice = arrlist.scan.nextInt();
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
