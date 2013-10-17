class Main {
    public static void main(String[] args) {
        char[] C = { 
         /* H */  or(shift(shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(getOne())))),
         /* e */  or(or(or(shift(shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(shift(shift(getOne())))))), shift(shift(getOne()))), getOne()),
         /* l */  or(or(or(shift(shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(getOne())))), shift(shift(getOne()))),
         /* l */  or(or(or(shift(shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(getOne())))), shift(shift(getOne()))),
         /* o */  or(or(or(or(or(shift(shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(getOne())))), shift(shift(getOne()))), shift(getOne())), getOne()),
         /*   */  shift(shift(shift(shift(shift(getOne()))))),
         /* W */  or(or(or(or(shift(shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(shift(getOne()))))), shift(shift(getOne()))), shift(getOne())), getOne()),
         /* o */  or(or(or(or(or(shift(shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(getOne())))), shift(shift(getOne()))), shift(getOne())), getOne()),
         /* r */  or(or(or(shift(shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(shift(getOne()))))), shift(getOne())),
         /* l */  or(or(or(shift(shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(getOne())))), shift(shift(getOne()))),
         /* d */  or(or(shift(shift(shift(shift(shift(shift(getOne())))))), shift(shift(shift(shift(shift(getOne())))))), shift(shift(getOne()))) };
        System.out.println(C);
    }

    private static int getOne() {
        return Math.abs(Boolean.compare(true, false));
    }

    private static char shift(int i) {
        return (char) (i << getOne());
    }

    private static char or(int i, int n) {
        return (char) (i | n);
    }
}
