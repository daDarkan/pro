package com.github.forax.pro.aether;

import org.eclipse.aether.artifact.Artifact;

public class ArtifactQuery {
  final Artifact artifact;

  ArtifactQuery(Artifact artifact) {
    this.artifact = artifact;
  }
  
  public String getArtifactKey() {
    return artifact.getGroupId() + ':' + artifact.getArtifactId();
  }
  
  public String getArtifactCoords() {
    return artifact.getGroupId() + ':' + artifact.getArtifactId() + ':' + artifact.getVersion();
  }
  
  @Override
  public String toString() {
    return getArtifactKey();
  }
}
