
package singlylist;


public class Insertion 
{
     Node head ;
    
    void insertion (int data)
    {
        
        Node n = new Node (data);
        
        if(head==null)
        {
            head = n; return;
        }
        
        Node temp = head ;
        
        while(temp.next!=null)
        {
            temp = temp.next ;
        
        }
        
        temp.next= n;
    }
    
    void display()
    {
        Node temp = head ;
        if(temp==null)
        {
            System.out.println("ARRAY LIST IS EMPTY");
        }
        
        else
        while(temp!=null)
        {
            System.out.print(temp.data+""+",");
            temp = temp.next;
        }
        
    
    }

    
    
    
}
