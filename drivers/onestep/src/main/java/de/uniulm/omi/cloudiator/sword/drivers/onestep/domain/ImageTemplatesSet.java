package de.uniulm.omi.cloudiator.sword.drivers.onestep.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public class ImageTemplatesSet {
    private Set<ImageTemplate> imageTemplates;
}