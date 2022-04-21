import java.util.Arrays;

public class arrayPlay {
    
    private String[] employName;
    private int[] ID;
    
    public arrayPlay() {
    }
    
    public arrayPlay(String[] newEmployName, int[] newID) {
        newEmployName = new String[]{"Susan", "Bill", "Margo", "Pamela", "Abe"};
        newID = new int[]{123, 245, 789, 354, 256};
        employName = newEmployName;
        ID = newID;
    }
    
    public void sortArray(String[] newEmployName) {
        Arrays.sort(employName);
    }
    
    public void sortArray(int[] newID) {
        Arrays.sort(ID);
    }
    
    public int linearSearch(int[] newID, int i, int key) {
        if (ID[i] != key) {
            return linearSearch(ID, i + 1, key);
        }
        else {
            return -1;
        }
    }
    
    public boolean binarySearch(String[] newEmployName, String key) {
        Arrays.binarySearch(employName, "Bill");
        return true;
    }
    
    public void displayResults(String[] newEmployName, int[] newID) {
        sortArray(employName);
        sortArray(ID);
        System.out.printf("Employee 1 name is %s and the employee ID is %d\n", employName[0], ID[0]);
        System.out.printf("Employee 2 name is %s and the employee ID is %d\n", employName[1], ID[1]);
        System.out.printf("Employee 3 name is %s and the employee ID is %d\n", employName[2], ID[2]);
        System.out.printf("Employee 4 name is %s and the employee ID is %d\n", employName[3], ID[3]);
        System.out.printf("Employee 5 name is %s and the employee ID is %d\n\n", employName[4], ID[4]);
        int search = linearSearch(ID, 0, 354);
        if (search == -1) {
            System.out.printf("The employee with ID of 354 is on the list.\n");
        }
        else {
            System.out.printf("The employee with ID of 354 is not on the list.\n");
        }
        if (binarySearch(employName, "Bill")) {
            System.out.printf("The employee with the name of Bill is on the list.\n");
        }
        else {
            System.out.printf("The employee with the name of Bill is not on the list.\n");
        }
    }
}
