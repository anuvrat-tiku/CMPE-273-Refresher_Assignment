import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.util.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class CardDriver extends Configured implements Tool {
	
	@SuppressWarnings("deprecation")
	public int run(String[] args) throws Exception {
		
		String input, output;
		if (args.length == 2) {
			input = args[0];
			output = args[1];
		}
		else {
			System.err.println("Incorrect number of arguments.   Expected Input Output");
			return -1;
		}
		
		Job job = new Job(getConf());
		
		job.setJarByClass(CardDriver.class);
		job.setJobName(this.getClass().getName());
		
		FileInputFormat.setInputPaths(job, new Path(input));
		FileOutputFormat.setOutputPath(job, new Path(output));
		
		job.setMapperClass(CardMapper.class);
		job.setReducerClass(CardTotalReducer.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		boolean success	= job.waitForCompletion(true);
		
		return success ? 0:1 ;
		
	}

	public static void main(String[] args) throws Exception {
		// Instantiating a version of itself
		CardDriver driver = new CardDriver();
		int exitCode = ToolRunner.run(driver, args);
		System.exit(exitCode);

	}

}
