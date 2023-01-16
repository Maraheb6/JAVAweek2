import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner s=new Scanner(System.in);

        {
            ArrayList<Integer> arryList = new ArrayList<Integer>();
            try {
                int size;
                System.out.println("1:  Accept elements of an array");
                System.out.println("2: Display elements of an array");
                System.out.println("3: Search the element within array");
                System.out.println("4: Sort the array");

                System.out.print("Make your choice: Or 0 to Stop: ");
                int choice = s.nextInt();

                while (choice != 0) {

                    if (choice == 1) {
                        System.out.println("Input size of Array:");
                        size = s.nextInt();
                        for (int i = 0; i < size; i++) {
                            System.out.println("Input Element" + i + ":");
                            arryList.add(s.nextInt());

                        }

                    } else if (choice == 2) {
                        for (int i = 0; i < arryList.size(); i++) {
                            System.out.println(arryList.get(i));
                        }
                    } else if (choice == 3) {

                           System.out.println("Input What Search for:");
                           int search = s.nextInt();
                           int index1 = arryList.get(search);
                           if (index1 == -1)
                               System.out.println("Not Found in Array");
                           else
                               System.out.println("Found in Array");


                    } else if (choice == 4) {
                        Collections.sort(arryList);
                        System.out.println("After Sorting:" + arryList);
                    }
                    System.out.println("1:  Accept elements of an array");
                    System.out.println("2: Display elements of an array");
                    System.out.println("3: Search the element within array");
                    System.out.println("4: Sort the array");

                    System.out.print("Make your choice: ");
                    choice = s.nextInt();


                }

        }catch(InputMismatchException e){
                System.out.println("Input Integer Please");
            }catch (IndexOutOfBoundsException e){
                System.out.println("Index out of Bounds");
            }



        }



    }
}