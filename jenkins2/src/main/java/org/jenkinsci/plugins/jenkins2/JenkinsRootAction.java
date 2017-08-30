package org.jenkinsci.plugins.jenkins2;

import hudson.Extension;
import hudson.model.RootAction;

@Extension
public class JenkinsRootAction implements RootAction {

	
	@Override
	public String getIconFileName() {
		// TODO Auto-generated method stub
		return "clipboard.png";
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return "Jenkins Plugin";
	}

	@Override
	public String getUrlName() {
		// TODO Auto-generated method stub
		return "http://google.com";
	}

}
