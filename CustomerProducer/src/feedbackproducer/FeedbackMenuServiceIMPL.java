package feedbackproducer;

public class FeedbackMenuServiceIMPL implements ViewMenuService{
	
	private static final String[] VALID_USERS = { "vinura", "vinal", "amali", "ravindi" };
    private static final String[] VALID_PASSWORDS = { "123", "123", "123", "123" };

    public void login(String username, String password) {
        for (int i = 0; i < VALID_USERS.length; i++) {
            if (username.equals(VALID_USERS[i]) && password.equals(VALID_PASSWORDS[i])) {
                System.out.println("  _                _         ____                              __       _ \r\n"
                		+ " | |    ___   __ _(_)_ __   / ___| _   _  ___ ___ ___ ___ ___ / _|_   _| |\r\n"
                		+ " | |   / _ \\ / _` | | '_ \\  \\___ \\| | | |/ __/ __/ _ / __/ __| |_| | | | |\r\n"
                		+ " | |__| (_) | (_| | | | | |  ___) | |_| | (_| (_|  __\\__ \\__ |  _| |_| | |\r\n"
                		+ " |_____\\___/ \\__, |_|_| |_| |____/ \\__,_|\\___\\___\\___|___|___|_|  \\__,_|_|\r\n"
                		+ "             |___/                                                        ");
                System.out.println("Logged as, " + VALID_USERS[i] + "!");
                break;
            }
            else {
            	System.out.println("Invalid username or password. Please try again.");
            }
            
        }

        
    }
    
	public void viewMenu() {
		System.out.println("----------------- System Log -----------------");
		
	}
	

}

