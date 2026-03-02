
package generics;

public class Immanvel <I,M>
{
    I data;
    M info;

    public Immanvel(I data, M info) {
        this.data = data;
        this.info = info;
    }

    
    
    void dis()
    {
        System.out.println(data);
        System.out.println(info);
    }
}
