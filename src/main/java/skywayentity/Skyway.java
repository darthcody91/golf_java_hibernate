package skywayentity;

import jakarta.persistence.*;

@Entity
public class Skyway {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Round")
    private int round;
    @Basic
    @Column(name = "Hole1")
    private int hole1;
    @Basic
    @Column(name = "Hole2")
    private int hole2;
    @Basic
    @Column(name = "Hole3")
    private int hole3;
    @Basic
    @Column(name = "Hole4")
    private int hole4;
    @Basic
    @Column(name = "Hole5")
    private int hole5;
    @Basic
    @Column(name = "Hole6")
    private int hole6;
    @Basic
    @Column(name = "Hole7")
    private int hole7;
    @Basic
    @Column(name = "Hole8")
    private int hole8;
    @Basic
    @Column(name = "Hole9")
    private int hole9;

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getHole1() {
        return hole1;
    }

    public void setHole1(int hole1) {
        this.hole1 = hole1;
    }

    public int getHole2() {
        return hole2;
    }

    public void setHole2(int hole2) {
        this.hole2 = hole2;
    }

    public int getHole3() {
        return hole3;
    }

    public void setHole3(int hole3) {
        this.hole3 = hole3;
    }

    public int getHole4() {
        return hole4;
    }

    public void setHole4(int hole4) {
        this.hole4 = hole4;
    }

    public int getHole5() {
        return hole5;
    }

    public void setHole5(int hole5) {
        this.hole5 = hole5;
    }

    public int getHole6() {
        return hole6;
    }

    public void setHole6(int hole6) {
        this.hole6 = hole6;
    }

    public int getHole7() {
        return hole7;
    }

    public void setHole7(int hole7) {
        this.hole7 = hole7;
    }

    public int getHole8() {
        return hole8;
    }

    public void setHole8(int hole8) {
        this.hole8 = hole8;
    }

    public int getHole9() {
        return hole9;
    }

    public void setHole9(int hole9) {
        this.hole9 = hole9;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Skyway skyway = (Skyway) o;

        if (round != skyway.round) return false;
        if (hole1 != skyway.hole1) return false;
        if (hole2 != skyway.hole2) return false;
        if (hole3 != skyway.hole3) return false;
        if (hole4 != skyway.hole4) return false;
        if (hole5 != skyway.hole5) return false;
        if (hole6 != skyway.hole6) return false;
        if (hole7 != skyway.hole7) return false;
        if (hole8 != skyway.hole8) return false;
        if (hole9 != skyway.hole9) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = round;
        result = 31 * result + hole1;
        result = 31 * result + hole2;
        result = 31 * result + hole3;
        result = 31 * result + hole4;
        result = 31 * result + hole5;
        result = 31 * result + hole6;
        result = 31 * result + hole7;
        result = 31 * result + hole8;
        result = 31 * result + hole9;
        return result;
    }
}
