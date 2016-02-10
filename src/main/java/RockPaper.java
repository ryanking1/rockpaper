import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaper {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/main.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");
      String userInput = request.queryParams("userInput");
      //Integer userNumber = Integer.parseInt(userStringNumber);
      //ArrayList<Object> results = new ArrayList<Object>();
      String results = RockPaper.checkWinner(userInput);

      model.put("results", results);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
  public static String randomComputer() {
    Random rand = new Random();
    Integer randomNumber = rand.nextInt((3 - 1)+1)+1;
    HashMap<Integer, String> numberValues = new HashMap<Integer, String>();
      numberValues.put(1, "rock");
      numberValues.put(2, "scissors");
      numberValues.put(3, "paper");

      String computerInput = numberValues.get(randomNumber);
      return computerInput;
  }

  public static String checkWinner(String userInput) {
    String input2 = RockPaper.randomComputer();
    String results = "";
    String input1 = userInput.toLowerCase();
    if (input1.equals("rock")) {
      if (input2.equals("scissors")) {
        results = "Player One Wins";
      } else if (input2.equals("paper")) {
        results = "Player Two Wins";
      } else {
        results = "You Tied!";
      }
    } else if (input1.equals("scissors")) {
      if (input2.equals("rock")) {
        results = "Player Two Wins";
      } else if (input2.equals("paper")) {
        results = "Player One Wins";
      } else {
        results = "You Tied!";
      }
    } else if (input1.equals("paper")) {
      if (input2.equals("rock")) {
        results = "Player One Wins";
      } else if (input2.equals("scissors")) {
        results = "Player Two Wins";
      } else {
        results = "You Tied!";
      }
    } else {
      results = "Please Enter Rock, Paper or Scissors!";
    }
  return results;
  }
}
