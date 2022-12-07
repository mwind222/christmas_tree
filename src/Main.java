import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter tree size : ");
        int tree_size = scan.nextInt();
        scan.close();
        int space_size = tree_size -1;
        int branch_count = 1;
        for (int i = 1; i<=tree_size ; i++  ) {
            // System.out.println("i=" + i);
            System.out.println(" ".repeat(space_size) + "*".repeat(branch_count));//https://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string
            space_size = space_size - 1;
            branch_count = branch_count + 2;
        }
        System.out.println(" ".repeat(tree_size -1) + "#".repeat(1));
    }
}
