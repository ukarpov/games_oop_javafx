package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not way by diagonal from %s to %s", source, dest)
            );
        }
//        int size = ...;
//        Cell[] steps = new Cell[size];
//        int deltaX = ...;
//        int deltaY = ...;
//        for (int index = 0; index < size; index++) {
//            steps[index] = ...
//        }
        //return steps;
        return new Cell[0];
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(source.x - source.y) == Math.abs(dest.x - dest.y) ||
               Math.abs(source.x + source.y) == Math.abs(dest.x + dest.y);
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
