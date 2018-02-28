import java.util.ArrayList;
import java.util.LinkedList;

public class ch_11_04
{
    /*Write a method called partition that accepts a list of integers and an integer value E as its parameter,
    and rearranges
    (partitions) the list so that all the elements with values less than E occur before all elements with values greater than E.
    The exact order of the elements is unimportant,
    so long as all elements less than E appear before all elements greater than
    E. For example, for the linked list [15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9],
    one acceptable ordering of the list after a call of partition(list, 5) would be [–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9].
    You may assume that the list contains no duplicates and does not contain the element value E.*/

    public static void main(String[] args)
    {
        LinkedList<Integer> rearrange = new LinkedList<>();
        rearrange.add(15);
        rearrange.add(1);
        rearrange.add(6);
        rearrange.add(12);
        rearrange.add(-3);
        rearrange.add(4);
        rearrange.add(8);
        rearrange.add(21);
        rearrange.add(2);
        rearrange.add(30);
        rearrange.add(-1);
        rearrange.add(9);

        partitions(5, rearrange);
        System.out.println(rearrange);

    }

    public static void partitions(int E, LinkedList<Integer> rearrange)
    {
        for (int i = 0; i < rearrange.size() ; i++)
        {
            if (E > rearrange.get(i) )
            {
                // holder på værdien
                int value = rearrange.get(i);
                // sletter værdien fra listen
                rearrange.remove(i);
                // tilføjer den først i listen
                rearrange.add(0,value);

            }
        }
    }
}
