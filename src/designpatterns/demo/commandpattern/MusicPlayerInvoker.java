package designpatterns.demo.commandpattern;

/*MusicPlayerInvoker will act as a invoker*/

public class MusicPlayerInvoker {
		
		private static MusicPlayer player = new MusicPlayer();
		
		private Command command;
		
		public void setCommand(Command command) {
			this.command = command;
		}
		
		public void executeCommand() {
			command.execute(player);
		}

}
