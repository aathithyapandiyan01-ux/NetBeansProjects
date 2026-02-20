
package doublylinkedlist;


public class Display extends Insertion 
{
    
    void display()
    {
        if (head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node temp = head ;
            while(temp!=null)
            {
                System.out.print(temp.data +"->"+"");
                temp = temp.next;
            }
    
        }
    
    }
        
    void display1()
    {
        if (tail==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node temp = tail ;
            while(temp!=null)
            {
                System.out.print(temp.data +"->"+"");
               temp = temp.previous;
            }
    
        }
    
    }
    
}
