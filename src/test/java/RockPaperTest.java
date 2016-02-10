import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class RockPaperTest {

  @Test
  public void checkWinner_rockBeatScissors_true() {
    RockPaper testRockPaper = new RockPaper();
    assertEquals("Player One Wins", testRockPaper.checkWinner("rock", "scissors"));
  }
  @Test
  public void checkWinner_rockLosestoPaper_true() {
    RockPaper testRockPaper = new RockPaper();
    assertEquals("Player Two Wins", testRockPaper.checkWinner("rock", "paper"));
  }
  @Test
  public void checkWinner_rocktiesrock_true() {
    RockPaper testRockPaper = new RockPaper();
    assertEquals("You Tied!", testRockPaper.checkWinner("rock", "rock"));
  }

  @Test
  public void checkWinner_scissorstorock_true() {
    RockPaper testRockPaper = new RockPaper();
    assertEquals("Player Two Wins", testRockPaper.checkWinner("scissors", "rock"));
  }

  @Test
  public void checkWinner_scissorstopaper_true() {
    RockPaper testRockPaper = new RockPaper();
    assertEquals("Player One Wins", testRockPaper.checkWinner("scissors", "paper"));
  }

  @Test
  public void checkWinner_scissorstoscissors_true() {
    RockPaper testRockPaper = new RockPaper();
    assertEquals("You Tied!", testRockPaper.checkWinner("scissors", "scissors"));
  }

  @Test
  public void checkWinner_papertorock_true() {
    RockPaper testRockPaper = new RockPaper();
    assertEquals("Player One Wins", testRockPaper.checkWinner("paper", "rock"));
  }

  @Test
  public void checkWinner_papertoscissors_true() {
    RockPaper testRockPaper = new RockPaper();
    assertEquals("Player Two Wins", testRockPaper.checkWinner("paper", "scissors"));
  }

  @Test
  public void checkWinner_papertopaper_true() {
    RockPaper testRockPaper = new RockPaper();
    assertEquals("You Tied!", testRockPaper.checkWinner("paper", "paper"));
  }

  @Test
  public void checkWinner_notrightinput_true() {
    RockPaper testRockPaper = new RockPaper();
    assertEquals("Please Enter Rock, Paper or Scissors!", testRockPaper.checkWinner("blah", "gah"));
  }

  @Test
  public void checkWinner_checkforlowercase_true() {
    RockPaper testRockPaper = new RockPaper();
    assertEquals("Player One Wins", testRockPaper.checkWinner("Rock", "cissors"));
  }
}
