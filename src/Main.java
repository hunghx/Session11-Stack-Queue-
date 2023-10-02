import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // list
        // thêm mới
//        stack.push(10);
//        stack.push(5);
//        stack.push(15);
//        stack.push(20);
//        stack.push(100);
        // 100-20-15-5-10
        // lấy ra
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop()); // pop() vừa lấy vừa xóa phần tử trên cùng của ngăn xếp
        // lấy phần tử trên cùng ra
//            System.out.println(stack.peek());
//            System.out.println(stack.peek());
//            // xóa phần tử trên cùng
//            stack.remove(stack.peek());

//        }


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        // thêm mới vào queue
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(10);
        priorityQueue.offer(4);
        priorityQueue.offer(5);
        while (!priorityQueue.isEmpty()){
            // lấy và xóa phần tử đầu tiên
            System.out.println(priorityQueue.poll());
        }

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(23); // 1
        arrayDeque.addFirst(2); // 2,1
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4);
        arrayDeque.addLast(5);
        arrayDeque.addLast(6);
        arrayDeque.addLast(7);
        System.out.println(arrayDeque); // 4,3,2,1,5,6,7
        while (!arrayDeque.isEmpty()){
            System.out.println(arrayDeque.poll());
        }
//
//        List<Student> list = new ArrayList<>();
//        list.add(new Student(1L,"Hùng",19));
//        list.add(new Student(2L,"Anh",16));
//        list.add(new Student(3L,"Nam",10));
//        list.add(new Student(4L,"Phương",26));
//        list.add(new Student(5L,"Phúc",18));
////        Collections.sort(list);// comparable
//
//
//
//        list.sort(new StudentComparatorByName()); // comparator
//        Collections.sort(list,new StudentComparatorByName());
////        Collections.sort(list,new StudentComparatorByAge());
//        for (Student s: list
//             ) {
//            System.out.println("ID" + s.getId()+"|name :"+s.getName()+"|Age:"+s.getAge());
//        }

    }
}