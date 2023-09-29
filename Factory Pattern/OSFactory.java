public class OSFactory {
    public OS getOperationSystem(String type){
        if(type.equals("Powerful")){
            return new Android();
        }
        else if(type.equals("Secure")){
            return new IOS();
        }else  if(type.equals("Both")){
            return new Windows();
        }
        return null;
    }
}
