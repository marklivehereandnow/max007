/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livehereandnow.ages.components;

import com.livehereandnow.ages.exception.AgesException;

/**
 *
 * @author mark
 */
public class HappyFaces {
    int points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) throws AgesException {
        this.points = points;
        
        if (points<0 || points > 8){
            throw new AgesException("setPoints error, Happy Faces Must be between 0 and 8");
        }
    }
    public void addPoints(int k) throws AgesException {
        this.points += k;
           if (points<0 || points > 8){
            throw new AgesException("addPoints error, Happy Faces Must be between 0 and 8");
        }
    }
    
}
