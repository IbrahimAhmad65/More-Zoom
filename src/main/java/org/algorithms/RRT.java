//package org.algorithms;
//
//import edu.wpi.first.math.Nat;
//import edu.wpi.first.math.Num;
//import edu.wpi.first.math.numbers.N2;
//import org.core.*;
//import org.core.Dynamics.Constraint;
//import org.core.Dynamics.Flat;
//import org.core.Dynamics.State;
//
//import java.util.List;
//import java.util.Random;
//
//import static java.lang.Math.sqrt;
//
//public class RRT<Dimensions extends Num, LessDimensions extends Num> {
//
//    public Tree<Dimensions> tree;
//    public Flat<LessDimensions> maxState;
//    public Flat<LessDimensions> minState;
//    public Constraint<Dimensions> fullStateConstraint;
//    int lessDimensions;
//    int moreDimensions;
//    private Node<Dimensions> start;
//    private Node<Dimensions> goal;
//    private Nat<Dimensions> bigNat;
//    private Nat<LessDimensions> smallNat;
//    private Random rand;
//    private int Iterations = 5000;
//
//    public RRT(Nat<Dimensions> bigDimension, Nat<LessDimensions> smallDimension, State<Dimensions> start, State<Dimensions> goal) {
//        this.lessDimensions = smallDimension.getNum();
//        this.moreDimensions = bigDimension.getNum();
//        this.start = new Node<>(bigDimension,start);
//        this.goal = new Node<>(bigDimension,goal);
//        rand = new Random();
//        this.smallNat = smallDimension;
//        this.bigNat = bigDimension;
//        tree = new Tree<>(bigDimension,this.start);
//    }
//
//    public List<State<Dimensions>> rrt(){
//        for (int i = 0; i < Iterations; i++) {
//            Flat<LessDimensions> random = findRandomFlat();
//            Node<Dimensions> near = findNearestNodeToFlat(random);
//
//        }
//        return null;
//    }
//
//    public Node<Dimensions> extend(Node<Dimensions> start, Flat<LessDimensions> flat){
//
//
//
//        Node<Dimensions> finalNode = null;
//        return finalNode;
//    }
//
//    public State<Dimensions> step(State<Dimensions> previousState,Flat<LessDimensions> goal,double dt){
//
//    }
//
//
//
//    Node<Dimensions> findNearestNodeToFlat(Flat<LessDimensions> f){
//        double[] varF = f.data;
//        double[] varN = new double[lessDimensions];
//        double minDistance = Double.POSITIVE_INFINITY;
//        Node<Dimensions> closest = null;
//        for (int i = 0; i < tree.size(); i++) {
//            Node<Dimensions> maybeClosest = tree.get(i);
//            for (int j = 0; j < lessDimensions; j++) {
//                varN[j] = maybeClosest.get(i);
//            }
//            if(distance(varF,varN) < minDistance){
//                closest = maybeClosest;
//                minDistance = distance(varF,varN);
//            }
//        }
//        return closest;
//    }
//
//    public static double distance(double[] d1, double[] d2){
//        double val = 0;
//        for (int i = 0; i < d1.length; i++) {
//            val += (d2[i]-d1[i]) * (d2[i]-d1[i]);
//        }
//        val = sqrt(val);
//        return val;
//    }
//
//    Flat<LessDimensions> findRandomFlat() {
//        double[] doubles = new double[lessDimensions];
//        for (int i = 0; i < lessDimensions; i++) {
//            doubles[i] = rand.nextDouble();
//        }
//        return new Flat<LessDimensions>(smallNat, doubles);
//    }
//    public static <Dim extends Num> void printPath(List<State<Dim>> path){
//        for (int i = 0; i < path.size() - 1; i++) {
//            State<Dim> current = path.get(i);
//            State<Dim> next = path.get(i+1);
//            // TODO im a bozo
//        }
//    }
//
//    public static void findNearestPointTest(){
//        Node<N2> n1 = new Node<>(Nat.N2(),0,0);
//        Node<N2> n2 = new Node<>(Nat.N2(),1,1);
//        Flat<N2> test = new Flat<>(Nat.N2(),1,2);
//        RRT<N2,N2> rr = new RRT<>(Nat.N2(),Nat.N2(),n1.getState(),n1.getState());
//        rr.tree.addNode(n2);
//        System.out.println(rr.tree.size());
//        Node<N2> near = rr.findNearestNodeToFlat(test);
//        System.out.println(near.get(0) + " " + near.get(1));
//    }
//
//    public static void main(String[] args) {
////        State<N4> start = new State<N4>(Nat.N4(),0,0,0,0);
////        State<N4> end = new State<N4>(Nat.N4(),1,1,0,0);
////
////        RRT<N4,N2> rrt = new RRT<>(Nat.N4(),Nat.N2(),start,end);
////        List<State<N4>> path = rrt.rrt();
////        printPath(path);
////        findNearestPointTest();
//    }
//}
