package Linked;

import Linked.Node;

public class myLinked<T>{

   private int size = 0;
   Node firstNode = null;
   Node lastNode = null;

   public myLinked(){

   }
/*
   public void add(int index,<T> element){
      if(size==0){
         firstNode = (Node) new Node(element, null, null);
         lastNode = firstNode;
      }
      else{
         lastNode = new Node(element, lastNode, null);
      }
   }

   public <T> get(int index){
      Node temporary = firstNode;
      for (int i = 0; i < index; i++) {
         temporary = temporary.getForward();
      }
      return temporary;
   }

 */
}
