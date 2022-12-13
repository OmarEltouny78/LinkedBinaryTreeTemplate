import java.util.Iterator;

public class LinkedBinaryTree<E> extends AbstractBinaryTree<E>{
    //create Node class
    protected static class Node<E> implements Position<E>{
        @Override
        public E getElement() throws IllegalStateException {
            return null;
        }
        // 4 variables

        //element type E

        //parent type Node

        //left type Node

        //right type Node

        //generate constructor,setter and getters

    }
    //END OF NODE CLASS --------------------------------------------------------------------------
    //create Node helper function returns new Node
    protected Node<E> createNode(E e, Node<E> parent,Node<E> left, Node<E> right) {
        return null;
    }
    //variables of Linked Tree Class

    //root Node

    //size int =0
    @Override
    //left will return the left child of the node
    public Position<E> left(Position<E> p) throws IllegalArgumentException {

        Node<E> node = validate(p);
        return null;
    }
    //right will return the right child of the node
    @Override
    public Position<E> right(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return null;
    }
    protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node))
            throw new IllegalArgumentException("Not valid position type");
        Node<E> node = (Node<E>) p;
        if (node.getParent( ) == node)
            throw new IllegalArgumentException("p is no longer in the tree");
        return node;
    }
    //return root
    @Override
    public Position<E> root() {
        return null;
    }
//return parent of the node
    @Override
    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
        return null;
    }
//similar to getSize()
    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new TreeIterator<>();
    }

//add first Node use createNode and change the value of size and return root
    public Position<E> addRoot(E e) throws IllegalStateException {
        return null;
    }
    //Check if there is a left child, if there is throw an exception
    //Create Node child with parent and e
    //set parent left node as child
    //increment the size
    //return the child
    public Position<E> addLeft(Position<E> p, E e) throws IllegalArgumentException {
        return null;

    }
    //Check if there is a right child, if there is throw an exception
    //Create Node child with parent and e
    //set parent right node as child
    //increment the size
    //return the child
    public Position<E> addRight(Position<E> p, E e) throws IllegalArgumentException {

        return null;
    }
    //Get the value in the node and store it in a temporary variable of type E
    //set Element on the node for the new value
    //return the temporary variable
    public E set(Position<E>p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return null;
    }

    //check if the position is internal
    //add the size of both trees
    //if t1 is not Empty
        //set the root of t1 to the parent of node
    //set Left of node to the root of t1
    //t1.root=null
    //t1.size=0
    //do the same for t2
    //set Right of node to the root of t2
    public void attach(Position<E> p, LinkedBinaryTree<E> t1,LinkedBinaryTree<E> t2) throws IllegalArgumentException {
        Node<E> node=validate(p);
        }

    //check the number of children if it is equal two throw exception
    //if child is null,then setParent node.getParent
    //if node equal root
    //root=child
    //else{
    // check if node == to the left node of the parent then set left of the parent to child}
    //else setRight
    //size--
    //after tem set element,right, left null
    //set Parent to node
    public E remove(Position<E> p) throws IllegalArgumentException{
       Node<E> node=validate(p);
        Node<E> child = (node.getLeft( ) != null ? node.getLeft( ) : node.getRight( ) );

        E temp = node.getElement( );

        return temp;
    }
}
