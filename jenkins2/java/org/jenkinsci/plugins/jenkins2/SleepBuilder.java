package org.jenkinsci.plugins.jenkins2;

import java.io.IOException;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;

import hudson.Extension;
import hudson.FilePath;
import hudson.Launcher;
import hudson.model.AbstractProject;
import hudson.model.Build;
import hudson.model.BuildListener;
import hudson.model.FreeStyleProject;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import hudson.util.FormValidation;

//@Extension
public class SleepBuilder extends Builder{
	private long time ;
	
	@DataBoundConstructor
	public SleepBuilder(long time){
		this.time = time;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	

	
	@Override
	public boolean perform(Build<?, ?> build, Launcher launcher, BuildListener listener)
			throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		listener.getLogger().println("Sleep for "+ time );
		Thread.sleep(time);
		return true;
	}
	

	
	@Extension
	public static final class DescriptorImpl extends BuildStepDescriptor<Builder>{

		@Override
		public boolean isApplicable(Class<? extends AbstractProject> jobType) {
			// TODO Auto-generated method stub
			return jobType == FreeStyleProject.class;
		}

		@Override
		public String getDisplayName() {
			// we created n
			return org.jenkinsci.plugins.jenkins2.Messages.SleepBuilder_DisplayName();
		}

		public FormValidation doCheckTime(@QueryParameter String time){
			try{
				if (Long.valueOf(time) < 0){
					return FormValidation.error("Enter Postive Value");
				}else {
					
					return FormValidation.ok();
				}
			}catch(Exception e){
				return FormValidation.error(e.toString());
			}
			
			
		}
		
	}
	
}
