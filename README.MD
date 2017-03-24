# Usage

* install rockchip yocto sdk, http://opensource.rock-chips.com/wiki_Yocto
* add meta-rockchip-fun to conf/bblayers.conf.
* add `PREFERRED_VERSION_ffmpeg = "git"` `PREFERRED_VERSION_mpv= "git"`  `LICENSE_FLAGS_WHITELIST = "commercial"` to conf/local.conf.
* `bitbake kodi-image`

