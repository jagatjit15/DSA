import java.util.ArrayList;public class CustomArrayList extends ArrayList {    @Override    public boolean add(Object obj) {        if(this.contains(obj))            return true;        else            return super.add(obj);    }    public static void main(String[] args) {        CustomArrayList list = new CustomArrayList();        list.add("Aman");        list.add("Chairman");        list.add("Aman");        list.add("Aman");        list.add(1);        list.add(1);        list.add(1);        list.add(2);        System.out.println(list);    }}