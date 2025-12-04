@RestController
public class Controller{
  @GetMapping("/greet")
  String greet(){
    return "welcome.iam YOGETH😃";
  }
}