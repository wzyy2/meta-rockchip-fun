# Copyright (C)  2017 Jacob Chen <jacob-chen@iotwrt.com>
# Released under the GNU GENERAL PUBLIC LICENSE Version 2
# (see COPYING.GPLv2 for the terms)

LICENSE = "CLOSED"
inherit pkgconfig cmake

DEPENDS += "fontconfig qtbase libconnman-qt5 samba"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/plexinc/plex-media-player.git;branch=master"
S = "${WORKDIR}/git"

EXTRA_OECMAKE = "     \
    -DRKPLATFORM=ON   \
    -DHAVE_DRM=ON     \
"