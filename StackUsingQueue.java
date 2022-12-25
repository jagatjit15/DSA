import java.util.LinkedList;import java.util.Queue;public class StackUsingQueue {   private Queue q1;   private Queue q2;    public StackUsingQueue(){        this.q1 = new LinkedList<>();        this.q2 = new LinkedList<>();    }    public void pushElement(int num){       q1.add(num);    }    public int pop(){        if(q1.isEmpty())            return -1;        int size = q1.size() - 1;        for(int i = 0; i < size; i++)            q2.add(q1.remove());        Queue q = q1;        q1 = q2;        q2 = q;        return (int) q2.remove();    }    public int peek(){        if(q1.isEmpty())            return -1;        int size = q1.size() - 1;        for(int i = 0; i < size; i++)            q2.add(q1.remove());        Queue q = q1;        q1 = q2;        q2 = q;        return (int) q2.peek();    }    public int length(){        return q1.size();    }    public boolean empty(){        return q1.isEmpty();    }    public static void main(String[] args) {        StackUsingQueue stack = new StackUsingQueue();        System.out.println(stack.peek());        System.out.println(stack.pop());        stack.pushElement(1);        stack.pushElement(2);        System.out.println(stack.pop());        stack.pushElement(4);        stack.pushElement(5);        System.out.println(stack.peek());        System.out.println(stack.empty());    }}