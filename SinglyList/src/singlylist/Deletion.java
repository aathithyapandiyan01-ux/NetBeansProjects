
package singlylist;


public class Deletion extends Insertion
{
    
    void deletion(int data)
    {
        
        if(head==null)
        {
            System.out.println("List are empty"); return ;
        }
        
        if(head.data==data)
        {
            head = head.next ; return;
        }
        
        Node temp = head ;
        
        while(temp.next!=null && temp.next.data!=data)
        {
            temp = temp.next ;
        }
        
        if(temp.next==null)
        {
            System.out.println("Given Value not found"); 
            return;
        }            
        
        temp.next = temp.next.next;
    
    }
    
    
}
