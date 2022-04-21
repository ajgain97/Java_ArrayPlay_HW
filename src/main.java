/**
 * My words and actions will reflect Academic Integrity. 
 * I will not cheat or lie or steal in academic matters. 
 * I will promote integrity in the UNCG community.
 * Austin Gain  03/01/2022
 */

/*
Test 1
Austin Gain
CSC 230, Sec. 3
*/

public class main {

    public static void main(String[] args) {
        System.out.println("Austin Gain\n" +
                "03/01/2022\n" +
                "CSC 230, Sec 3\n\n" +
                "This program creates 2 objects of array type and works with them.\n" +
                "The arrays contain employee names and IDs.\n");
        String[] employeeArray = new String[5];
        int[] IDArray = new int[5];
        arrayPlay a1 = new arrayPlay(employeeArray, IDArray);
        a1.displayResults(employeeArray, IDArray);
    }
}

// Total Run Time = O(n log n)
