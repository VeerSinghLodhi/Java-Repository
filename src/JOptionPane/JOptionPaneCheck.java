/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JOptionPane;

/**
 *
 * @author Veersingh Lodhi
 */
public class JOptionPaneCheck {
//    static     {   
//        JOptionPane.showMessageDialog(null,"Message text","Message Title",3);
//    }
    public static int getSizeInBytes(Class<?> type) {
        if (type == Integer.TYPE) return Integer.SIZE / 8; // int
        if (type == Long.TYPE) return Long.SIZE / 8;       // long
        if (type == Short.TYPE) return Short.SIZE / 8;     // short
        if (type == Byte.TYPE) return Byte.SIZE / 8;       // byte
        if (type == Character.TYPE) return Character.SIZE / 8; // char
        if (type == Float.TYPE) return Float.SIZE / 8;     // float
        if (type == Double.TYPE) return Double.SIZE / 8;   // double
        return -1; // Unknown type
    }
    public int[] twoSum(int[] nums, int target) {
        java.util.ArrayList l1=new java.util.ArrayList();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){}
                    l1.add(i);
                    l1.add(j);
            }
            }
    int [] arr=new int[l1.size()];
        for(int v=0;v<l1.size();v++){
            arr[v]=Integer.parseInt(l1.get(v).toString());
        }
        return arr;
        
        
    }
    public static void main(String [] args)
    {
        int a=10;
        System.out.println();
       System.out.println("Size of int: " + getSizeInBytes(int.class) + " bytes");
        System.out.println("Size of long: " + getSizeInBytes(long.class) + " bytes");
    }
    
}
