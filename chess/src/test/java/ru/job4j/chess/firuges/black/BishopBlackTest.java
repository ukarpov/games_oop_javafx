package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenCheckPosition() {
        Cell f8 = Cell.F8;
        BishopBlack bb1 = new BishopBlack(f8);
        assertEquals(f8, bb1.position());
    }

    @Test
    public void whenCheckCopy() {
        Figure bb1 = new BishopBlack(Cell.F8);
        bb1 = bb1.copy(Cell.H6);
        assertEquals(Cell.H6, bb1.position());
    }

    @Test
    public void whenCheckWay() {
        Figure bb1 = new BishopBlack(Cell.C1);
        Cell[] way = bb1.way(bb1.position(), Cell.G5);
        assertArrayEquals(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}, way);
    }
}
