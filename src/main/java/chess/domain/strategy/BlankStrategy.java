package chess.domain.strategy;

import chess.domain.board.Board;
import chess.domain.piece.Piece;
import chess.domain.position.Position;
import chess.exception.PieceImpossibleMoveException;

import java.util.List;

public class BlankStrategy implements MoveStrategy {
    @Override
    public List<Position> possiblePositions(final Board board, final Piece piece) {
        throw new PieceImpossibleMoveException("빈 칸은 움직일 수 없습니다.");
    }
}
