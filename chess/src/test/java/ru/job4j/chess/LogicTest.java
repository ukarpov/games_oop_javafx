package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.junit.Assert.*;

public class LogicTest {
    @Test
    public void whenCheckMoveOk() {
        Logic l = new Logic();
        Cell source = Cell.D4;
        Cell dest = Cell.H8;
        l.add(new BishopBlack(source));
        assertTrue(l.move(source, dest));
    }

    @Test
    public void whenCheckMoveBadMove() {
        Logic l = new Logic();
        Cell source = Cell.D4;
        Cell dest = Cell.D8;
        l.add(new BishopBlack(source));
        assertFalse(l.move(source, dest));
    }

    @Test
    public void whenCheckMoveIntersect() {
        Logic l = new Logic();
        Cell source = Cell.D4;
        Cell dest = Cell.H8;
        Cell wayStop = Cell.F6;
        l.add(new BishopBlack(source));
        l.add(new PawnBlack(wayStop));
        assertFalse(l.move(source, dest));
    }
}
