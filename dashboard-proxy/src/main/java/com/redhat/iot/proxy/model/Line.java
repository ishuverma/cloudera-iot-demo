/*
 * ******************************************************************************
 * Copyright (c) 2017 Red Hat, Inc. and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat Inc. - initial API and implementation
 *
 * ******************************************************************************
 */
package com.redhat.iot.proxy.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name="line")
public class Line implements Serializable {

    private String name;
    private String lid;
    private String desc;
    private String status;
    private List<Machine> machines;
    private String currentFid;
    private Run currentRun;

    public Line() {

    }

    public Run getCurrentRun() {
        return currentRun;
    }

    public void setCurrentRun(Run currentRid) {
        this.currentRun = currentRid;
    }

    public String getCurrentFid() {
        return currentFid;
    }

    public void setCurrentFid(String currentFid) {
        this.currentFid = currentFid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lin) {
        this.lid = lin;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
}
