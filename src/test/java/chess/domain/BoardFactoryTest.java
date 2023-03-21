package chess.domain;

import static org.assertj.core.api.Assertions.assertThat;

import chess.domain.piece.Bishop;
import chess.domain.piece.King;
import chess.domain.piece.Knight;
import chess.domain.piece.Pawn;
import chess.domain.piece.Piece;
import chess.domain.piece.Queen;
import chess.domain.piece.Rook;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BoardFactoryTest {

    @Test
    @DisplayName("체스판에서 빈 칸을 포함한 말들의 개수가 64개다.")
    void create_Success() {
        // given
        Map<Position, Piece> board = BoardFactory.create();

        // expect
        assertThat(board)
                .hasSize(64);
    }

    @Test
    @DisplayName("체스판에 말들이 정확하게 생성되어야 한다.")
    void create_Correctly() {
        // given
        Map<Position, Piece> squares = BoardFactory.create();

        // expect
        assertThat(squares)
                .containsAllEntriesOf(Map.ofEntries(
                        Map.entry(Position.of(0, 0), new Rook(Team.WHITE)),
                        Map.entry(Position.of(1, 0), new Knight(Team.WHITE)),
                        Map.entry(Position.of(2, 0), new Bishop(Team.WHITE)),
                        Map.entry(Position.of(3, 0), new Queen(Team.WHITE)),
                        Map.entry(Position.of(4, 0), new King(Team.WHITE)),
                        Map.entry(Position.of(5, 0), new Bishop(Team.WHITE)),
                        Map.entry(Position.of(6, 0), new Knight(Team.WHITE)),
                        Map.entry(Position.of(7, 0), new Rook(Team.WHITE)),
                        Map.entry(Position.of(0, 1), new Pawn(Team.WHITE)),
                        Map.entry(Position.of(1, 1), new Pawn(Team.WHITE)),
                        Map.entry(Position.of(2, 1), new Pawn(Team.WHITE)),
                        Map.entry(Position.of(3, 1), new Pawn(Team.WHITE)),
                        Map.entry(Position.of(4, 1), new Pawn(Team.WHITE)),
                        Map.entry(Position.of(5, 1), new Pawn(Team.WHITE)),
                        Map.entry(Position.of(6, 1), new Pawn(Team.WHITE)),
                        Map.entry(Position.of(7, 1), new Pawn(Team.WHITE)),
                        Map.entry(Position.of(0, 6), new Pawn(Team.BLACK)),
                        Map.entry(Position.of(1, 6), new Pawn(Team.BLACK)),
                        Map.entry(Position.of(2, 6), new Pawn(Team.BLACK)),
                        Map.entry(Position.of(3, 6), new Pawn(Team.BLACK)),
                        Map.entry(Position.of(4, 6), new Pawn(Team.BLACK)),
                        Map.entry(Position.of(5, 6), new Pawn(Team.BLACK)),
                        Map.entry(Position.of(6, 6), new Pawn(Team.BLACK)),
                        Map.entry(Position.of(7, 6), new Pawn(Team.BLACK)),
                        Map.entry(Position.of(0, 7), new Rook(Team.BLACK)),
                        Map.entry(Position.of(1, 7), new Knight(Team.BLACK)),
                        Map.entry(Position.of(2, 7), new Bishop(Team.BLACK)),
                        Map.entry(Position.of(3, 7), new Queen(Team.BLACK)),
                        Map.entry(Position.of(4, 7), new King(Team.BLACK)),
                        Map.entry(Position.of(5, 7), new Bishop(Team.BLACK)),
                        Map.entry(Position.of(6, 7), new Knight(Team.BLACK)),
                        Map.entry(Position.of(7, 7), new Rook(Team.BLACK))
                ));
    }
}
