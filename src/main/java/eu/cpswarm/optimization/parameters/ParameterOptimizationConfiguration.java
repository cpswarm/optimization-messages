/**
 * File: ParameterOptimizationConfiguration.java
 * 
 * Copyright (C) 2020 CPSwarm Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package eu.cpswarm.optimization.parameters;

import java.util.ArrayList;
import java.util.List;

public class ParameterOptimizationConfiguration {

  // @SerializedName("")
  protected int generation;
  protected int generationCount;
  protected int candidateCount;
  protected int variantCount;

  protected int evolutionSeed;
  protected int evaluationSeed;

  protected double generationTimeoutFactor;
  protected int simulationTimeoutSeconds;

  protected List<ParameterDefinition> parameters;

  protected List<Candidate> candidates;

  protected double directMutationProbability;
  protected double directMutationSeverity;
  protected double proportionalMutationProbability;
  protected double proportionalMutationSeverity;

  protected double skewFactor;
  protected double eliteWeight;
  protected double randomWeight;
  protected double mutatedWeight;
  protected double crossedWeight;
  protected double newWeight;

  public ParameterOptimizationConfiguration() {

    // basic
    generation = 0;
    generationCount = 100;
    candidateCount = 100;
    variantCount = 10;

    // seeds
    evolutionSeed = 0;
    evaluationSeed = 0;

    // time outs
    generationTimeoutFactor = 2;
    simulationTimeoutSeconds = 120;

    // definitions
    parameters = new ArrayList<>();

    // candidates
    candidates = new ArrayList<>();

    // ParameterSetOp parameters
    directMutationProbability = 0.2;
    directMutationSeverity = 0.1;
    proportionalMutationProbability = 0.1;
    proportionalMutationSeverity = 0.1;

    // NNGA parameters
    skewFactor = 1;
    eliteWeight = 0.2;
    randomWeight = 0.2;
    mutatedWeight = 0.2;
    crossedWeight = 0.2;
    newWeight = 0.2;
  }

  /**
   * @return the generation
   */
  public int getGeneration() {
    return generation;
  }

  /**
   * 
   * @param generation
   */
  public void setGeneration(int generation) {
    this.generation = generation;
  }

  /**
   * @return the generationCount
   */
  public int getGenerationCount() {
    return generationCount;
  }

  /**
   * 
   * @param generationCount
   */
  public void setGenerationCount(int generationCount) {
    this.generationCount = generationCount;
  }

  /**
   * @return the candidateCount
   */
  public int getCandidateCount() {
    return candidateCount;
  }

  /**
   * 
   * @param candidateCount
   */
  public void setCandidateCount(int candidateCount) {
    this.candidateCount = candidateCount;
  }

  /**
   * @return the variantCount
   */
  public int getVariantCount() {
    return variantCount;
  }

  /**
   * @param variantCount the variantCount to set
   */
  public void setVariantCount(int variantCount) {
    this.variantCount = variantCount;
  }

  /**
   * @return the evolutionSeed
   */
  public int getEvolutionSeed() {
    return evolutionSeed;
  }

  /**
   * @param evolutionSeed the evolutionSeed to set
   */
  public void setEvolutionSeed(int evolutionSeed) {
    this.evolutionSeed = evolutionSeed;
  }

  /**
   * @return the evaluationSeed
   */
  public int getEvaluationSeed() {
    return evaluationSeed;
  }

  /**
   * @param evaluationSeed the evaluationSeed to set
   */
  public void setEvaluationSeed(int evaluationSeed) {
    this.evaluationSeed = evaluationSeed;
  }

  /**
   * @return the generationTimeoutFactor
   */
  public double getGenerationTimeoutFactor() {
    return generationTimeoutFactor;
  }

  /**
   * @param generationTimeoutFactor the generationTimeoutFactor to set
   */
  public void setGenerationTimeoutFactor(double generationTimeoutFactor) {
    this.generationTimeoutFactor = generationTimeoutFactor;
  }

  /**
   * @return the simulationTimeoutSeconds
   */
  public int getSimulationTimeoutSeconds() {
    return simulationTimeoutSeconds;
  }

  /**
   * @param simulationTimeoutSeconds the simulationTimeoutSeconds to set
   */
  public void setSimulationTimeoutSeconds(int simulationTimeoutSeconds) {
    this.simulationTimeoutSeconds = simulationTimeoutSeconds;
  }

  /**
   * @return the parameters
   */
  public List<ParameterDefinition> getParameters() {
    return parameters;
  }

  /**
   * @param parameters the parameters to set
   */
  public void setParameters(List<ParameterDefinition> parameters) {
    this.parameters = parameters;
  }

  /**
   * @return the candidates
   */
  public List<Candidate> getCandidates() {
    return candidates;
  }

  /**
   * @param candidates the candidates to set
   */
  public void setCandidates(List<Candidate> candidates) {
    this.candidates = candidates;
  }

  /**
   * @return the directMutationProbability
   */
  public double getDirectMutationProbability() {
    return directMutationProbability;
  }

  /**
   * @param directMutationProbability the directMutationProbability to set
   */
  public void setDirectMutationProbability(double directMutationProbability) {
    this.directMutationProbability = directMutationProbability;
  }

  /**
   * @return the directMutationSeverity
   */
  public double getDirectMutationSeverity() {
    return directMutationSeverity;
  }

  /**
   * @param directMutationSeverity the directMutationSeverity to set
   */
  public void setDirectMutationSeverity(double directMutationSeverity) {
    this.directMutationSeverity = directMutationSeverity;
  }

  /**
   * @return the proportionalMutationProbability
   */
  public double getProportionalMutationProbability() {
    return proportionalMutationProbability;
  }

  /**
   * @param proportionalMutationProbability the proportionalMutationProbability to set
   */
  public void setProportionalMutationProbability(double proportionalMutationProbability) {
    this.proportionalMutationProbability = proportionalMutationProbability;
  }

  /**
   * @return the proportionalMutationSeverity
   */
  public double getProportionalMutationSeverity() {
    return proportionalMutationSeverity;
  }

  /**
   * @param proportionalMutationSeverity the proportionalMutationSeverity to set
   */
  public void setProportionalMutationSeverity(double proportionalMutationSeverity) {
    this.proportionalMutationSeverity = proportionalMutationSeverity;
  }

  /**
   * @return the skewFactor
   */
  public double getSkewFactor() {
    return skewFactor;
  }

  /**
   * @param skewFactor the skewFactor to set
   */
  public void setSkewFactor(double skewFactor) {
    this.skewFactor = skewFactor;
  }

  /**
   * @return the eliteWeight
   */
  public double getEliteWeight() {
    return eliteWeight;
  }

  /**
   * @param eliteWeight the eliteWeight to set
   */
  public void setEliteWeight(double eliteWeight) {
    this.eliteWeight = eliteWeight;
  }

  /**
   * @return the randomWeight
   */
  public double getRandomWeight() {
    return randomWeight;
  }

  /**
   * @param randomWeight the randomWeight to set
   */
  public void setRandomWeight(double randomWeight) {
    this.randomWeight = randomWeight;
  }

  /**
   * @return the mutatedWeight
   */
  public double getMutatedWeight() {
    return mutatedWeight;
  }

  /**
   * @param mutatedWeight the mutatedWeight to set
   */
  public void setMutatedWeight(double mutatedWeight) {
    this.mutatedWeight = mutatedWeight;
  }

  /**
   * @return the crossedWeight
   */
  public double getCrossedWeight() {
    return crossedWeight;
  }

  /**
   * @param crossedWeight the crossedWeight to set
   */
  public void setCrossedWeight(double crossedWeight) {
    this.crossedWeight = crossedWeight;
  }

  /**
   * @return the newWeight
   */
  public double getNewWeight() {
    return newWeight;
  }

  /**
   * @param newWeight the newWeight to set
   */
  public void setNewWeight(double newWeight) {
    this.newWeight = newWeight;
  }
}
