package Questions30_45;

import java.util.ArrayList;
import java.util.List;

public class Q12 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(100);

        System.out.println(list);
    }
}

//List cannot accept primitives, it can accept objects only. So, when 100 and 200 are added to the list,
// then auto-boxing feature converts these to wrapper objects of Integer type.
//
//So, 4 items gets added to the list. One can expect the same behavior with remove method as well that 100 will be auto-boxed to Integer object.
//
//But remove method is overloaded in List interface: remove(int) => Removes the element from the specified position in this list
//
//and remove(Object)  => Removes the first occurrence of the specified element from the list.
//
//As remove(int) version is available, which perfectly matches with the call remove(100); hence compiler does not do auto-boxing in this case.
//
//But at runtime remove(100) tries to remove the element at 100th index and this throws IndexOutOfBoundsException.