public class BJCard {
    private int card1;
    private int card2;
    private int card3;
    private int card4;
    private int card5;
    private int bet;
    private int money;
    private int sum;
    private int chip100;
    private int chip20;
    private int chip10;
    private int chip5;
    private int chip1;
    //private Image img = new Image();
    //private TryImage fun;

    public BJCard() {
        card1 = (int) (Math.random() * 13 + 1);
        card2 = (int) (Math.random() * 13 + 1);
        card3 = (int) (Math.random() * 13 + 1);
        card4 = (int) (Math.random() * 13 + 1);
        card5 = (int) (Math.random() * 13 + 1);
        bet = 0;
        money = (int) (Math.random() * 450 + 50);
        sum = 0;
        chips();

    }

    public BJCard(BJCard other) {
        card1 = (int) (Math.random() * 13 + 1);
        card2 = (int) (Math.random() * 13 + 1);
        card3 = (int) (Math.random() * 13 + 1);
        card4 = (int) (Math.random() * 13 + 1);
        card5 = (int) (Math.random() * 13 + 1);
        bet = other.bet;
        money = other.money;
        sum = other.sum;
    }

    public void secsim() {
        if (this.card1 >= 11) card1 = 10;
        if (this.card2 >= 11) card2 = 10;
        if (this.card3 >= 11) card3 = 10;
        if (this.card4 >= 11) card4 = 10;
        if (this.card5 >= 11) card5 = 10;

    }

    public int computerSum(BJCard dealer, int all) {
        int x = 2;

        if (x == 2 && all >= 2) {
            if (dealer.getCard1() + dealer.getCard2() <= 16) { //2 CARDS ONLY, ADD A CARD IF NEEDED!!
                if (dealer.getCard1() == 1) {
                    if (dealer.getCard1() + 10 + dealer.getCard2() >= 17 && dealer.getCard1() + 10 + dealer.getCard2() <= 21) {
                        dealer.sum = (dealer.getCard1() + 10 + dealer.getCard2());
                    } else {
                        x++;
                        //Comput.simplifycomp(x);
                    }
                } else if (dealer.getCard2() == 1) {
                    if (dealer.getCard1() + dealer.getCard2() + 10 >= 17 && dealer.getCard1() + dealer.getCard2() + 10 <= 21) {
                        dealer.sum = (dealer.getCard1() + dealer.getCard2() + 10);
                    } else {
                        x++;
                        //Comput.simplifycomp(x);
                    }
                } else {
                    x++;
                    //Comput.simplifycomp(x);
                }
            } else {
                //Comput.simplifycomp(x);
                dealer.sum = dealer.getCard1() + dealer.getCard2();
            }
        }

        if (x == 3 && all >= 3) { //3 CARDS ONLY, ADD A CARD IF NEEDED!!
            if (dealer.getCard1() + dealer.getCard2() + dealer.getCard3() <= 16) {
                if (dealer.getCard1() == 1) {
                    if (dealer.getCard1() + 10 + dealer.getCard2() + dealer.getCard3() >= 17 && dealer.getCard1() + 10 + dealer.getCard2() + dealer.getCard3() <= 21) {
                        dealer.sum = dealer.getCard1() + 10 + dealer.getCard2() + dealer.getCard3();
                    } else {
                        x++;
                        //Comput.simplifycomp(x);
                    }
                } else if (dealer.getCard2() == 1) {
                    if (dealer.getCard1() + dealer.getCard2() + 10 + dealer.getCard3() >= 17 && dealer.getCard1() + dealer.getCard2() + 10 + dealer.getCard3() <= 21) {
                        dealer.sum = dealer.getCard1() + dealer.getCard2() + 10 + dealer.getCard3();
                    } else {
                        x++;
                        //Comput.simplifycomp(x);
                    }
                } else if (dealer.getCard3() == 1) {
                    if (dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + 10 >= 17 && dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + 10 <= 21) {
                        dealer.sum = dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + 10;
                    } else {
                        x++;
                        //Comput.simplifycomp(x);
                    }
                } else {
                    x++;
                    //Comput.simplifycomp(x);
                }
            } else {
                //Comput.simplifycomp(x);
                dealer.sum = dealer.getCard1() + dealer.getCard2() + dealer.getCard3();
            }
        }

        if (x == 4 && all >= 4) {//4 CARDS ONLY, ADD A CARD IF NEEDED!
            if (dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + dealer.getCard4() <= 16) {
                if (dealer.getCard1() == 1) {
                    if (dealer.getCard1() + 10 + dealer.getCard2() + dealer.getCard3() + dealer.getCard4() >= 17 && dealer.getCard1() + 10 + dealer.getCard2() + dealer.getCard3() + dealer.getCard4() <= 21) {
                        dealer.sum = dealer.getCard1() + 10 + dealer.getCard2() + dealer.getCard3() + dealer.getCard4();
                    } else {
                        x++;
                        //Comput.simplifycomp(x);
                    }
                } else if (dealer.getCard2() == 1) {
                    if (dealer.getCard1() + dealer.getCard2() + 10 + dealer.getCard3() + dealer.getCard4() >= 17 && dealer.getCard1() + dealer.getCard2() + 10 + dealer.getCard3() + dealer.getCard4() <= 21) {
                        dealer.sum = dealer.getCard1() + dealer.getCard2() + 10 + dealer.getCard3() + dealer.getCard4();
                    } else {
                        x++;
                        //Comput.simplifycomp(x);
                    }
                } else if (dealer.getCard3() == 1) {
                    if (dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + 10 + dealer.getCard4() >= 17 && dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + 10 + dealer.getCard4() <= 21) {
                        dealer.sum = dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + 10 + dealer.getCard4();
                    } else {
                        x++;
                        //Comput.simplifycomp(x);
                    }
                } else if (dealer.getCard4() == 1) {
                    if (dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + dealer.getCard4() + 10 >= 17 && dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + dealer.getCard4() + 10 <= 21) {
                        dealer.sum = dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + dealer.getCard4() + 10;
                    } else {
                        x++;
                        //Comput.simplifycomp(x);
                    }
                } else {
                    x++;
                    //Comput.simplifycomp(x);
                }
            } else {
                //Comput.simplifycomp(x);
                dealer.sum = dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + dealer.getCard4();
            }
        }

        if (x == 5 && all >= 5) {
            dealer.sum = dealer.getCard1() + dealer.getCard2() + dealer.getCard3() + dealer.getCard4() + dealer.getCard5();
        }
        return x;
    }

    public int computerSumend(BJCard Comput) {
        int x = 2;

        if (x == 2) {
            if (Comput.getCard1() + Comput.getCard2() <= 16) { //2 CARDS ONLY, ADD A CARD IF NEEDED!!
                if (Comput.getCard1() == 1) {
                    if (Comput.getCard1() + 10 + Comput.getCard2() >= 17 && Comput.getCard1() + 10 + Comput.getCard2() <= 21) {
                        Comput.setCard1(11);
                        //System.out.println("Computer: Choosing 11 and " + Comput.getCard2());
                        Comput.sum = (Comput.getCard1() + Comput.getCard2());
                    } else {
                        x++;
                    }
                } else if (Comput.getCard2() == 1) {
                    if (Comput.getCard1() + Comput.getCard2() + 10 >= 17 && Comput.getCard1() + Comput.getCard2() + 10 <= 21) {
                        Comput.setCard2(11);
                        //System.out.println("Computer: Choosing " + Comput.getCard1() + " and 11");
                        Comput.sum = (Comput.getCard1() + Comput.getCard2());
                    } else {
                        x++;
                    }
                } else {
                    x++;
                }
            } else {
                Comput.sum = Comput.getCard1() + Comput.getCard2();
            }
        }

        if (x == 3) { //3 CARDS ONLY, ADD A CARD IF NEEDED!!
            if (Comput.getCard1() + Comput.getCard2() + Comput.getCard3() <= 16) {
                if (Comput.getCard1() == 1) {
                    if (Comput.getCard1() + 10 + Comput.getCard2() + Comput.getCard3() >= 17 && Comput.getCard1() + 10 + Comput.getCard2() + Comput.getCard3() <= 21) {
                        Comput.setCard1(11);
                        //System.out.println("Computer: Choosing 11 and " + Comput.getCard2() + " and " + Comput.getCard3());
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3();
                    } else {
                        x++;
                    }
                } else if (Comput.getCard2() == 1) {
                    if (Comput.getCard1() + Comput.getCard2() + 10 + Comput.getCard3() >= 17 && Comput.getCard1() + Comput.getCard2() + 10 + Comput.getCard3() <= 21) {
                        Comput.setCard2(11);
                        //System.out.println("Computer: Choosing " + Comput.getCard1() + "and 11 and" + Comput.getCard3());
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3();
                    } else {
                        x++;
                    }
                } else if (Comput.getCard3() == 1) {
                    if (Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + 10 >= 17 && Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + 10 <= 21) {
                        Comput.setCard3(11);
                        //System.out.println("Computer: Choosing " + Comput.getCard1() + " and " + Comput.getCard2() + " and 11");
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3();
                    } else {
                        x++;
                    }
                } else {
                    x++;
                }
            } else {
                Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3();
            }
        }

        if (x == 4) { //4 CARDS ONLY, ADD A CARD IF NEEDED!
            if (Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() <= 16) {
                if (Comput.getCard1() == 1) {
                    if (Comput.getCard1() + 10 + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() >= 17 && Comput.getCard1() + 10 + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() <= 21) {
                        Comput.setCard1(11);
                        //System.out.println("Computer: Choosing 11 and " + Comput.getCard2() + " and " + Comput.getCard3() + " and " + Comput.getCard4());
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4();
                    } else {
                        x++;
                    }
                } else if (Comput.getCard2() == 1) {
                    if (Comput.getCard1() + Comput.getCard2() + 10 + Comput.getCard3() + Comput.getCard4() >= 17 && Comput.getCard1() + Comput.getCard2() + 10 + Comput.getCard3() + Comput.getCard4() <= 21) {
                        Comput.setCard2(11);
                        //System.out.println("Computer: Choosing " + Comput.getCard1() + " and 11 and" + Comput.getCard3() + " and " + Comput.getCard4());
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4();
                    } else {
                        x++;
                    }
                } else if (Comput.getCard3() == 1) {
                    if (Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + 10 + Comput.getCard4() >= 17 && Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + 10 + Comput.getCard4() <= 21) {
                        Comput.setCard3(11);
                        //System.out.println("Computer: Choosing " + Comput.getCard1() + " and " + Comput.getCard2() + " and 11 and " + Comput.getCard4());
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4();
                    } else {
                        x++;
                    }
                } else if (Comput.getCard4() == 1) {
                    if (Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + 10 >= 17 && Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + 10 <= 21) {
                        Comput.setCard4(11);
                        //System.out.println("Computer: Choosing " + Comput.getCard1() + " and " + Comput.getCard2() + " and " + Comput.getCard3() + " and 11");
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4();
                    } else {
                        x++;
                    }
                } else {
                    x++;
                }
            } else {
                Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4();
            }
        }

        if (x == 5) {
            if (Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5() <= 16) {
                if (Comput.getCard1() == 1) {
                    if (Comput.getCard1() + 10 + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5() >= 17 && Comput.getCard1() + 10 + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5() <= 21) {
                        Comput.setCard1(11);
                        //System.out.println("Computer: Choosing 11 and " + Comput.getCard2() + " and " + Comput.getCard3() + " and " + Comput.getCard4() + " and " Comput.getCard5());
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
                    } else {
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
                    }
                } else if (Comput.getCard2() == 1) {
                    if (Comput.getCard1() + Comput.getCard2() + 10 + Comput.getCard3() + Comput.getCard4() + Comput.getCard5() >= 17 && Comput.getCard1() + Comput.getCard2() + 10 + Comput.getCard3() + Comput.getCard4() + Comput.getCard5() <= 21) {
                        Comput.setCard2(11);
                        //System.out.println("Computer: Choosing " + Comput.getCard1() + " and 11 and" + Comput.getCard3() + " and " + Comput.getCard4() + " and " + Comput.getCard5());
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
                    } else {
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
                    }
                } else if (Comput.getCard3() == 1) {
                    if (Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + 10 + Comput.getCard4() + Comput.getCard5() >= 17 && Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + 10 + Comput.getCard4() + Comput.getCard5() <= 21) {
                        Comput.setCard3(11);
                        //System.out.println("Computer: Choosing " + Comput.getCard1() + " and " + Comput.getCard2() + " and 11 and " + Comput.getCard4() + " and " + Comput.getCard5());
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
                    } else {
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
                    }
                } else if (Comput.getCard4() == 1) {
                    if (Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + 10 + Comput.getCard5() >= 17 && Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + 10 + Comput.getCard5() <= 21) {
                        Comput.setCard4(11);
                        //System.out.println("Computer: Choosing " + Comput.getCard1() + " and " + Comput.getCard2() + " and " + Comput.getCard3() + " and 11 and " + Comput.getCard5());
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
                    } else {
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
                    }
                } else if (Comput.getCard5() == 1) {
                    if (Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5() + 10 >= 17 && Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5() + 10 <= 21) {
                        Comput.setCard5(11);
                        //System.out.println("Computer: Choosing " + Comput.getCard1() + " and " + Comput.getCard2() + " and " + Comput.getCard3() + " and " + Comput.getCard4() + " and 11");
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
                    } else {
                        Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
                    }
                } else {
                    Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
                }
            } else {
                Comput.sum = Comput.getCard1() + Comput.getCard2() + Comput.getCard3() + Comput.getCard4() + Comput.getCard5();
            }
        }
        return Comput.sum;
    }

    public void shuffle() {
        card1 = (int) (Math.random() * 13 + 1);
        card2 = (int) (Math.random() * 13 + 1);
        card3 = (int) (Math.random() * 13 + 1);
        card4 = (int) (Math.random() * 13 + 1);
        card5 = (int) (Math.random() * 13 + 1);
    }

    public int getCard1() {
        return card1;
    }

    public void setCard1(int c1) {
        card1 = c1;
    }

    public int getCard2() {
        return card2;
    }

    public void setCard2(int c2) {
        card2 = c2;
    }

    public int getCard3() {
        return card3;
    }

    public void setCard3(int c3) {
        card3 = c3;
    }

    public int getCard4() {
        return card4;
    }

    public void setCard4(int c4) {
        card4 = c4;
    }

    public int getCard5() {
        return card5;
    }

    public void setCard5(int c5) {
        card5 = c5;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int b) {
        bet = b;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int m) {
        money = m;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int s) {
        sum = s;
    }

    public int getChip100() {
        return chip100;
    }

    public void setChip100(int x) {
        chip100 = x;
    }

    public int getChip20() {
        return chip20;
    }

    public void setChip20(int x) {
        chip20 = x;
    }

    public int getChip10() {
        return chip10;
    }

    public void setChip10(int x) {
        chip10 = x;
    }

    public int getChip5() {
        return chip5;
    }

    public void setChip5(int x) {
        chip5 = x;
    }

    public int getChip1() {
        return chip1;
    }

    public void setChip1(int x) {
        chip1 = x;
    }

    public void chips() {
        chip100 = 0;
        chip20 = 0;
        chip10 = 0;
        chip5 = 0;
        chip1 = 0;
        int pMoney = getMoney();
        while (pMoney - 100 >= 100) {
            if (pMoney >= 100) {
                chip100++;
                pMoney -= 100;
            }
        }
        while (pMoney - 20 >= 20) {
            if (pMoney >= 20) {
                chip20++;
                pMoney -= 20;
            }
        }
        while (pMoney - 10 >= 10) {
            if (pMoney >= 10) {
                chip10++;
                pMoney -= 10;
            }
        }
        while (pMoney - 5 >= 5) {
            if (pMoney >= 5) {
                chip5++;
                pMoney -= 5;
            }
        }
        while (pMoney >= 1) {
            if (pMoney >= 1) {
                chip1++;
                pMoney -= 1;
            }
        }
    }
}