class Node {
    private Shade shade;
    private Node left;
    private Node right;

    Node(Shade shade){
        this.shade = shade;
    }

    private Shade getShade() {
        return shade;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Boolean isOmbre (Node binTree){

        if (binTree.getRight() == null && binTree.getLeft()== null){
            return true;
        }else {
            Shade shade = binTree.getShade();
            String shadeOne = shade.getOne();
            String shadeTwo = shade.getTwo();
            if (binTree.getLeft() == null) {
                if (sideOmbreCheck(binTree.getRight(), shadeOne, shadeTwo)) {
                    return isOmbre(binTree.getRight());
                }
                else return false;
            } else if (binTree.getLeft() != null && binTree.getRight() == null) {
                if (sideOmbreCheck(binTree.getLeft(), shadeOne, shadeTwo)) {
                    return isOmbre(binTree.getRight());
                }
                else return false;
            } else {
                if ((sideOmbreCheck(binTree.getLeft(), shadeOne, shadeTwo) &&
                        (sideOmbreCheck(binTree.getRight(), shadeOne, shadeTwo)))){
                    return (isOmbre(binTree.getLeft()) && (isOmbre(binTree.getRight())));

                }
                else return false;
            }
        }
    }

    private Boolean sideOmbreCheck(Node right, String shadeOne, String shadeTwo){
        Shade sideShade = right.getShade();
        String sideShadeOne = sideShade.getOne();
        String sideShadeTwo = sideShade.getTwo();
        if (sideShadeOne.equals(shadeOne)|| sideShadeOne.equals(shadeTwo)){
            return true;
        }
        else return (sideShadeTwo.equals(shadeOne) || sideShadeTwo.equals(shadeTwo));
    }

}