package com.tictactoe.strategy;

import com.tictactoe.model.Board;
import com.tictactoe.model.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);

    void undo(Board board, Move move);
}