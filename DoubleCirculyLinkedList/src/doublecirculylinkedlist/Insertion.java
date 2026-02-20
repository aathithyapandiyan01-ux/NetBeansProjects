
package doublecirculylinkedlist;


public class Insertion
{
    
    Node head;
    Node tail;
    
    void insertion(int data)
    {
        Node n = new Node (data);
        
        if(head ==null)
        {
            head = n;
            tail=n;
            tail.next=n;
            head.next=n;
        }
        
        else
        {
            tail.next=n;
            n.next=head;
            n.previous=head;
            head.previous=n;
            tail=n;
        }
    
    }
    
    void display()
    {
        if(head==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            Node temp = head ;
            do
            {
                System.out.println(temp.data+" ->");
                temp = temp.next;
            
            
            }while(temp!=head);
        }
    }
    
    void middleAdd(int position , int data)
    {
        
        if(head==null)
        {
            System.out.println("List is empty");
        }
        
        else
        {
            Node n = new Node( data);
            
            Node temp = head;
            
            if(temp.data!=position)
            {
                n.previous=temp;
                n.next=temp.next;
                temp.previous=n;
                temp = n;
                
                
                
            
            
            
            }
            
            
        
        
        
        }
    
    
    }
    
}
