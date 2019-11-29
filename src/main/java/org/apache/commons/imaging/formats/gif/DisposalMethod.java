package org.apache.commons.imaging.formats.gif;

/**
 * Describes the disposal of a GIF frame when rendering the animation. Frames that aren't disposed can show through
 * transparent pixels of coming frames. This allows new layers to contain just the part of the animation that changes.
 */
public enum DisposalMethod {

    /**
     * Typically used for a full-size non-transparent frame that will be replaced by another.
     */
    UNSPECIFIED,

    /**
     * The next frame should be rendered on top of this frame.
     */
    DO_NOT_DISPOSE,

    /**
     * Dispose the frame and restore the background.
     */
    RESTORE_TO_BACKGROUND,

    /**
     * Dispose the frame and restore the previous undisposed frame.
     */
    RESTORE_TO_PREVIOUS,

    /**
     * Unused method 1.
     */
    TO_BE_DEFINED_1,

    /**
     * Unused method 2.
     */
    TO_BE_DEFINED_2,

    /**
     * Unused method 3.
     */
    TO_BE_DEFINED_3,

    /**
     * Unused method 4.
     */
    TO_BE_DEFINED_4
}
