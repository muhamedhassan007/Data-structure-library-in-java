/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author HP
 */
public class impstack {
    private Node first=null;
    private class  Node{
        String item;
        Node next;
    }
    public void push( String item){
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;
        
    }
    public String pop(){
        String item = first.item;
        first=first.next;
        return item;
    } 
}
