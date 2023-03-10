/**
 *
 */
package com.github.lhoz.monitor.file.model;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

import lombok.Getter;

/**
 * @author Lhoz
 *
 */
public class FileMonitorEvent {
	private final @Getter File file;
	private final @Getter String path;

	/**
	 * @param file
	 */
	public FileMonitorEvent(final File file) {
		this.file = file;
		this.path = FilenameUtils.separatorsToSystem(file.getAbsolutePath());
	}
}
