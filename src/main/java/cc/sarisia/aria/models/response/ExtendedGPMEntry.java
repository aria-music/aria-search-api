package cc.sarisia.aria.models.response;

import cc.sarisia.aria.models.Entry;
import cc.sarisia.aria.models.GPMEntry;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class ExtendedGPMEntry {
    @NotBlank
    @Getter @Setter
    private String uri;

    @NotBlank
    @Getter @Setter
    private String provider;

    @NotBlank
    @Getter @Setter
    private String title;

    @Setter
    private String thumbnail;

    @Getter @Setter
    private boolean liked;

    @Valid
    @Getter @Setter
    private GPMEntry meta;

    public String getThumbnail() {
        return this.thumbnail == null ? "" : this.thumbnail;
    }
}
