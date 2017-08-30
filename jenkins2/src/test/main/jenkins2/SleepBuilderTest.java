package jenkins2;

import org.jenkinsci.plugins.jenkins2.SleepBuilder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

import hudson.model.FreeStyleBuild;
import hudson.model.FreeStyleProject;

public class SleepBuilderTest {

	@Rule
	public JenkinsRule r = new JenkinsRule();
	
	@Test
	public void checkSleepTime() throws Exception{
		
	long time =  1000;
	SleepBuilder sleepBuilder = new SleepBuilder(time);
	FreeStyleProject p = r.createFreeStyleProject();
	p.getBuildersList().add(sleepBuilder);
	
	// When 
	FreeStyleBuild build = p.scheduleBuild2(0).get();
	
	// Then 
	Assert.assertTrue(build.getLog().contains("Sleep for "+ time));
	}
	
}
