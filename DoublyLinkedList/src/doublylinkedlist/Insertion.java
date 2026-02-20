
package doublylinkedlist;


public class Insertion 
{
    
    Node head ;
    Node tail;
    
    void addForward(int data)
    {
        
        Node newNode = new Node(data);
        
        if(head ==null)
        {
            head = newNode;
            tail = newNode;
        }
        
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    
    }
    
    void addBackward(int data)
    {
        
        Node n = new Node(data);
        
        if(tail==null)
        {
            head = n ;
            tail = n;
        }
        
        else
        {
            n.next = head ;
            head.previous= n;
            head = n ;
        }
    }
    
}
