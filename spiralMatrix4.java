/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=-1;
            }
        }
       int firstCol=0;
        int lastCol=n-1;
        int firstRow=0;
        int lastRow=m-1;
        int count=n*m;
        int c=0;
        //first row
        int i=0;
        int j=0;
        while(true){
        for(i=firstCol;i<=lastCol && head!=null && c<count ;i++){
            arr[firstRow][i]=(head!=null)?head.val:-1;
            head=head.next;
           c++;
            
        }
        firstRow++;
        //last col
        for(i=firstRow;i<=lastRow && head!=null && c<count ; i++){
            arr[i][lastCol]=(head!=null)?head.val:-1;
            head=head.next;
            c++;
        }
        lastCol--;
    //last row
        for(i=lastCol;i>=firstCol && head!=null && c<count;i--){
            arr[lastRow][i]=(head!=null)?head.val:-1;
            head=head.next;
            c++;
        }
            lastRow--;
            
        //first col
            for(i=lastRow;i>=firstRow && head!=null && c<count;i--){
                arr[i][firstCol]=(head!=null)?head.val:-1;
            head=head.next;
            c++;
            }
            firstCol++;
        
        if(head==null || c>=count)
            break;
        
        }
        return arr;
        
    }
}